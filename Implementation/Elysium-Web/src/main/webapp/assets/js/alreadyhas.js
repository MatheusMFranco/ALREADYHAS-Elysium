getInfoMessage("info", "Loading languages...");

var text;
var selection = navigator.language;

getInfoMessage("success", "Browser language found.");
getInfoMessage("info", "Loading english language...");

var english = {	"slogan"				:	"A software for doctors.",

				"title_welcome"	 		: 	"Welcome to Elysium!",

				"title_403_error"		:	"Forbidden",
				"title_404_error"		:	"Page Not Found",
				"title_500_error"		:	"Internal Server Error",

				"option_color_normal"	: 	"Normal",
				"option_color_positive"	: 	"Positive",
				"option_color_negative"	: 	"Negative",
				"option_color_reverse"	: 	"Reverse",

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
				"hint_bnt_close"		:	"Click to close message",
				"hint_link_register"	:	"Click to a new account",
				"hint_link_forgot_psw" 	: 	"Click to renew your password",
				"hint_language" 		: 	"Select your language",
				"hint_color"	 		: 	"Select the color of site",

				"message_403_error"		:	"WHAT?! You are trying to access a page that was not? Ask permission to the support team or your supervisor to have access to this page. :P",
				"message_404_error"		:	"The page you tried to access does not exist or ceased to exist ... '_'",
				"message_500_error"		:	"Did something happen on the server... =/",

				"form_error_0"			:	"Fill in the required fields.",
				"form_error_1"			:	"The username have 4 characters.",
				"form_error_2"			:	"The password have 8 characters."
				};
getInfoMessage("info", "Loading portuguese language...");

var portugues ={"slogan"				:	"Um software para médicos.",

				"title_welcome"	 		: 	"Bem-vindo ao Elysium!",

				"title_403_error"		:	"Proibido",
				"title_404_error"		:	"Página Não Encontrada",
				"title_500_error"		:	"Erro Interno no Servidor",

				"option_color_normal"	: 	"Normal",
				"option_color_positive"	: 	"Positivo",
				"option_color_negative"	: 	"Negativo",
				"option_color_reverse"	: 	"Reverso",

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
				"hint_bnt_close"		:	"Clique para fechar a mensagem",
				"hint_link_register"	:	"Clique aqui para uma nova conta",
				"hint_link_forgot_psw" 	: 	"Clique aqui para renovar a sua senha",
				"hint_language" 		: 	"Selecione o seu idioma",
				"hint_color"	 		: 	"Selecione a cor do site",

				"message_403_error"		:	"O QUE?! Você está tentando acessar uma página que não devia? Peça autorização para a equipe de suporte ou ao seu supervisor para que tenha acesso a esta página. :P",
				"message_404_error"		:	"A página que você está tentando acessar não existe ou parou de existir... '_'",
				"message_500_error"		:	"Aconteceu alguma coisa no servidor... =/",

				"form_error_0"			:	"Preencha os campos obrigatórios.",
				"form_error_1"			:	"O usuário deve ter 4 dígitos.",
				"form_error_2"			:	"A senha deve ter 8 dígitos."
				};

getInfoMessage("info", "Loading espanish language...");

var espanol ={	"slogan"				:	"Un software para los médicos.",

				"title_welcome"	 		: 	"Bienvenido al Elysium!",
		
				"title_403_error"		:	"Prohibido",
				"title_404_error"		:	"Página No Encontrada",
				"title_500_error"		:	"Error Interno del Servidor",

				"option_color_normal"	: 	"Normal",
				"option_color_positive"	: 	"Positivo",
				"option_color_negative"	: 	"Negativo",
				"option_color_reverse"	: 	"Reverso",

				"username" 				: 	"Usuario",
				"password" 				: 	"Contraseña", 
		
				"bnt_login"				:	"Entrar",
				"bnt_reset"				:	"Limpiar",
				"bnt_back"				:	"Retornar",
		
				"link_register"			:	"¡Únete ahora!",
				"link_forgot_password" 	: 	"He olvidado mi contraseña...",
		
				"hint_username"			:	"Introduzca el nombre de su usuario",
				"hint_password"			:	"Introduzca su contraseña",
				"hint_bnt_login"		:	"Clic aquí para iniciar la sesión",
				"hint_bnt_reset"		:	"Clic aquí para limpiar los campos",
				"hint_bnt_back"			:	"Clic aquí para retornar a la página anterior",
				"hint_bnt_close"		:	"Clic aqui para encerrar la mensage",
				"hint_link_register"	:	"Clic aquí para una nueva cuenta",
				"hint_link_forgot_psw" 	: 	"Clic aquí para renovar su contraseña",
				"hint_language" 		: 	"Seleccione su idioma",
				"hint_color"	 		: 	"Seleccione la cor del site",
		
				"message_403_error"		:	"¡¿QUÉ?! Usted está intentando acceder a una página que no era? Pedir permiso al equipo de soporte o su supervisor para tener acceso a esta página. :P",
				"message_404_error"		:	"La página que está intentando acceder no existe o ha dejado de existir ...'_'",
				"message_500_error"		:	"Pasó algo en el servidor... = /",

				"form_error_0"			:	"Rellene los campos obligatorios.",
				"form_error_1"			:	"El usuario debe tener 4 dígitos.",
				"form_error_2"			:	"La contraseña debe tener 8 dígitos."
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
    case "pt-BR":{
    	text = portugues;
    	textLanguageChanged("Portuguese");
    	break;
    } 

    case "es":{
    	text = espanol;
    	textLanguageChanged("Spanish");
    	break;
     }

    case "en": default:{
    	text = english;
    	textLanguageChanged("English");
    }
  }

   setTextLanguageInPages();		

}

function setTextLanguageInPages(){
	$("#slogan")				.text(text.slogan);

	$("#title-welcome")			.text(text.title_welcome);	

	$("#title-403-error")		.text(text.title_403_error);
	$("#title-404-error")		.text(text.title_404_error);
	$("#title-500-error")		.text(text.title_500_error);

	$("#title-username")		.text(text.username); 				
	$("#title-password")		.text(text.password); 				

	$("#txt-login")				.text(text.bnt_login);				
	$("#txt-reset")				.text(text.bnt_reset);				
	$("#txt-back")				.text(text.bnt_back);			

	$("#link-register")			.text(text.link_register);			
	$("#link-forgot-password")	.text(text.link_forgot_password);

	$("#message-403-error")		.text(text.message_403_error);
	$("#message-404-error")		.text(text.message_404_error);
	$("#message-500-error")		.text(text.message_500_error);

	$("#color-normal")			.text(text.option_color_normal);
	$("#color-positive")		.text(text.option_color_positive);
	$("#color-negative")		.text(text.option_color_negative);
	$("#color-reverse")			.text(text.option_color_reverse);

	//Hint
	$("#username")				.attr("title", text.hint_username);			
	$("#password")				.attr("title", text.hint_password);

	$("#bnt-login")				.attr("title", text.hint_bnt_login);		
	$("#bnt-reset")				.attr("title", text.hint_bnt_reset);		
	$("#bnt-back")				.attr("title", text.hint_bnt_back);

	$("#link-register")			.attr("title", text.hint_link_register);	
	$("#link-forgot-password")	.attr("title", text.hint_link_forgot_psw);

	$("#change-language")		.attr("title", text.hint_language);
	$("#change-color")			.attr("title", text.hint_color);

	//Placeholder
	$("#username").attr("placeholder", text.hint_username);			
	$("#password").attr("placeholder", text.hint_password);
}

$("#change-language").change(function(){

  $("#change-language option:selected").each(function () {
    selection = $(this).attr("id");
  });

  changeLanguage(selection);
  location.reload();
});

function textLanguageChanged(language){
	getInfoMessage("info", "The language of the page has been changed to " + language + ".");
}