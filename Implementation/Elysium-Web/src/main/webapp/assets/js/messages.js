var messageBoxExists = false;
var ERROR 	= new Array();
ERROR[0] 	= text.form_error_0;
ERROR[1] 	= text.form_error_1;
ERROR[2] 	= text.form_error_2;

$(function (){
	$("#username").val(null);
	$("#password").val(null);
	lockedLoginButton();
});

$("#bnt-login").click(function validateLogin(){
	var userField 		= $("#username").val();
	var passwordField 	= $("#password").val();
	getInfoMessage("info", "Log button was triggered.");
	
	if(validadeaAllFieldsLoginRequired(userField, passwordField))
		return true;
	return false;
});

$("#username").keydown(function regex(keyPressed) {
	getInfoMessage("info", "Key pressed in the username field.");
	if (validateNumbers(keyPressed)
		|| validateWord(keyPressed) 
		|| validateDiretionalComands(keyPressed)
		|| validateReturnComands(keyPressed)
		){
		notAriaInvalid("username");
		getInfoMessage("info", "Keys released.");
		return true;
	}else{
		getInfoMessage("info", "Keys locked informed.");
		return false;
  }
});

function validateNumbers(keyPressed){
	return (keyPressed.keyCode >= 48 && keyPressed.keyCode <= 57) ? true : false;
}

function validateWord(keyPressed){
	return (keyPressed.keyCode >= 65 && keyPressed.keyCode <= 90) ? true : false;
}

function validateDiretionalComands(keyPressed){
	return (keyPressed.keyCode >= 37 && keyPressed.keyCode <= 40) ? true : false;
}

function validateReturnComands(keyPressed){
	return (keyPressed.keyCode == 16 || keyPressed.keyCode == 9 || keyPressed.keyCode == 8) ? true : false;
}

$("#username").keyup( function enterUser(){
	var userField 		= $("#username").val();
	var passwordField 	= $("#password").val();

	$("#username").addClass("input__unauthenticated--upper");

	if(!validadeaAllFieldsLoginRequired(userField, passwordField))
		lockedLoginButton();
});

$("#password").keyup( function enterPassword(){
	var userField 		= $("#username").val();
	var passwordField 	= $("#password").val();
	getInfoMessage("info", "Key pressed in the password field.");

	if(!validadeaAllFieldsLoginRequired(userField, passwordField))
		lockedLoginButton();
});

function lockedLoginButton(){
	$("#bnt-login").attr("disable", "disable");
	$("#bnt-login").attr("title", ERROR[0]);
	$("#bnt-login").addClass("button__unauthenticated--disable");
}

function unlockLoginButton(){
	$("#message-box").hide();
	$("#bnt-login").removeAttr("disable");
	$("#bnt-login").removeClass("button__unauthenticated--disable");
	getInfoMessage("info", "Login is ready.");
}

function validadeaAllFieldsLoginRequired(user, password){
	if(validateUser(user) && validatePassword(password)){
		getInfoMessage("info", "Ready to login.");
		unlockLoginButton();
		return true;
	}
	return false;
}

function validateUser(field){
	if(field.length < 4){
		$("#title-username").addClass("label__unauthenticated--error");

		getErrorMessage(ERROR[1]);
		ariaInvalid("username", ERROR[1]);

		validateFieldNull(field);
		return false;
	}else{
		$("#title-username").removeClass("label__unauthenticated--error");
		notAriaInvalid("username");
		return true;
	}
}

function validatePassword(field){
	if(field.length < 8){
		$("#title-password").addClass("label__unauthenticated--error");

		getErrorMessage(ERROR[2]);
		ariaInvalid("password", ERROR[2]);

		validateFieldNull(field);
		return false;
	}else{
		$("#title-password").removeClass("label__unauthenticated--error");
		notAriaInvalid("password");
		return true;
	}
}

function validateFieldNull(field){
	if(field.length <= 0){
		getErrorMessage(ERROR[0]);
		ariaInvalid("username", ERROR[0]);
		ariaInvalid("password", ERROR[0]);
	}
}

function ariaInvalid(id, message){
	$("#" + id).attr("aria-describedby", message);
	$("#" + id).attr("aria-invalid", "true");
}

function notAriaInvalid(id){
	$("#" + id).attr("aria-describedby", "");
	$("#" + id).attr("aria-invalid", "false");
}

function getErrorMessage(message){
	getMessage();
	$("#message-icon").addClass("fa fa-times-circle");
	$("#message-box").addClass("w3-red message__error").show();
	$("#message-text").text(message);
	getInfoMessage("error", message);
}

function getMessage(){
	if(messageBoxExists == false){
		$("#message-box").append(getMessageContent());
		$("#close-message-box").attr("title", text.hint_bnt_close);

		$("#close-message-box").click(function closeMessage(){
			$("#message-box").hide();
		});
		messageBoxExists = true;
	}
}

function getCloseIcon(){
	return "<i id='close-message-box' class='w3-closebtn fa fa-times icon__close' title='Click to close message'></i>";
}

function getIconMessage(){
	return "<i id='message-icon'></i>";
}

function getMessageText(){
	return "<span id='message-text'></span>";
}

function getMessageContent(){
	return getCloseIcon()
	+ "<span id='message-content'>" 
	+ getIconMessage()+ " "
	+ getMessageText() 
	+ "</span>";
}