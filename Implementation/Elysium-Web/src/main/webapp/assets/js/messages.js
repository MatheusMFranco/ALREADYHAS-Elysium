var messageBoxExists = false;
var ERROR 	= new Array();
ERROR[0] 	= text.form_error_0;
ERROR[1] 	= text.form_error_1;
ERROR[2] 	= text.form_error_2;

$(function (){
	$("#username").val(null);
	$("#password").val(null);
	locked();
});

$("#bnt-login").click(function validateLogin(){
	var userField 		= $("#username").val();
	var passwordField 	= $("#password").val();

	if(validadeaAllFieldsLoginRequired(userField, passwordField))
		return true;
	return false;
});

$("#username").keyup( function enterUser(){
	var userField 		= $("#username").val();
	var passwordField 	= $("#password").val();
	
	if(!validadeaAllFieldsLoginRequired(userField, passwordField))
		locked();
});

$("#password").keyup( function enterPassword(){
	var userField 		= $("#username").val();
	var passwordField 	= $("#password").val();

	if(!validadeaAllFieldsLoginRequired(userField, passwordField))
		locked();
});

function locked(){
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
		unlockLoginButton();
		return true;
	}
	return false;
}

function validateUser(field){
	if(field.length < 4){
		$("#title-username").addClass("label__unauthenticated--error");
		getErrorMessage("error", ERROR[1]);
		validateFieldNull(field);
		return false;
	}else{
		$("#title-username").removeClass("label__unauthenticated--error");
		return true;
	}
}

function validatePassword(field){
	if(field.length < 8){
		$("#title-password").addClass("label__unauthenticated--error");
		getErrorMessage("error", ERROR[2]);
		validateFieldNull(field);
		return false;
	}else{
		$("#title-password").removeClass("label__unauthenticated--error");
		return true;
	}
}

function validateFieldNull(field){
	if(field.length <= 0){
		getErrorMessage("error", ERROR[0]);
	}
}

function getErrorMessage(type, message){
	getMessage();
	$("#message-icon").addClass("fa fa-times-circle");
	$("#message-box").addClass("w3-red message__error").show();
	$("#message-text").text(message);
	getInfoMessage(type, message);
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