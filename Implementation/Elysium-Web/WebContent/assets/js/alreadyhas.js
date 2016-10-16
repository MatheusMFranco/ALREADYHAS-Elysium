var text;
var selection = navigator.language;

var english = {	"slogan"				:	"A software for doctors.",
				"title_welcome"	 		: 	"Welcome to Elysium!",
				"title_404_error"		:	"Page Not Found",
				"username" 				: 	"User Name",
				"password" 				: 	"Password", 
				"bnt_login"				:	"Login",
				"bnt_reset"				:	"Reset",
				"bnt_back"				:	"Return",
				"link_register"			:	"Register Now!",
				"link_forgot_password" 	: 	"I forgot the password...",
				"hint_username"			:	"Insert your user name",
				"hint_password"			:	"Insert your password",
				"hint_bnt_login"		:	"Click to login",
				"hint_bnt_reset"		:	"Click to reset inputs",
				"hint_bnt_back"			:	"Click to return to the previous page",
				"hint_link_register"	:	"Click to a new account",
				"hint_link_forgot_psw" 	: 	"Click to renew your password",
				"message_404_error"		:	"The page you tried to access does not exist or ceased to exist ... '_'"
				};

var portugues ={"slogan"				:	"Um software para médicos.",
				"title_welcome"	 		: 	"Bem-vindo ao Elysium!",
				"title_404_error"		:	"Página Não Encontrada",
				"username" 				: 	"Usuário",
				"password" 				: 	"Senha", 
				"bnt_login"				:	"Logar",
				"bnt_reset"				:	"Limpar",
				"bnt_back"				:	"Voltar",
				"link_register"			:	"Registre-se Agora!",
				"link_forgot_password" 	: 	"Esqueci a minha senha...",
				"hint_username"			:	"Insira o nome do seu usuário",
				"hint_password"			:	"Insira a sua senha",
				"hint_bnt_login"		:	"Clique aqui para logar",
				"hint_bnt_reset"		:	"Clique aqui para limpar os campos",
				"hint_bnt_back"			:	"Clique aqui para retornar a página anterior",
				"hint_link_register"	:	"Clique aqui para uma nova conta",
				"hint_link_forgot_psw" 	: 	"Clique aqui para renovar a sua senha",
				"message_404_error"		:	"A página que você está tentando acessar não existe ou parou de existir... '_'"
				};

getDefaultLanguage();

function getDefaultLanguage(){
	if(localStorage.getItem("language") == "undefined") {
		localStorage.setItem("language", selection);
	}

	changeLanguage(localStorage.getItem("language"));
}
				
function changeLanguage(form){

	$("#" + form).attr("selected", "selected");

	localStorage.setItem("language", form);

	switch(form){
    case	"pt-BR":{
      text = portugues;
      break;
    } 

    case "en": default:{
      text = english;
    }
  }

   setTextLanguageInPages();		

}

function setTextLanguageInPages(){
	$("#slogan")				.text(text.slogan);
	$("#title-welcome")			.text(text.title_welcome);	 		
	$("#title-404-error")		.text(text.title_404_error);		
	$("#title_username")		.text(text.username); 				
	$("#title_password")		.text(text.password); 				
	$("#bnt-login")				.text(text.bnt_login);				
	$("#bnt-reset")				.text(text.bnt_reset);				
	$("#bnt-back")				.text(text.bnt_back);			
	$("#link-register")			.text(text.link_register);			
	$("#link-forgot-password")	.text(text.link_forgot_password);
	$("#message-404-error")		.text(text.message_404_error); 	
	//Hint
	$("#username")				.attr("title", text.hint_username);			
	$("#password")				.attr("title", text.hint_password);
	$("#bnt-login")				.attr("title", text.hint_bnt_login);		
	$("#bnt-reset")				.attr("title", text.hint_bnt_reset);		
	$("#bnt-back")				.attr("title", text.hint_bnt_back);		
	$("#link-register")			.attr("title", text.hint_link_register);	
	$("#link-forgot-password")	.attr("title", text.hint_link_forgot_psw);	
	//Placeholder
	$("#username").attr("placeholder", text.hint_username);			
	$("#password").attr("placeholder", text.hint_password);
}

$("#change-language").change(function(){

  $("#change-language option:selected").each(function () {
    selection = $(this).attr("id");
  });

  changeLanguage(selection);
 
});