var INFO_MESSAGE 		= "[INFO] ";
var ERROR_MESSAGE 		= "[ERROR] ";
var WARNING_MESSAGE 	= "[WARN] ";
var SUCCESS_MESSAGE 	= "[SUCCESS] ";
var UNDEFINED_MESSAGE 	= "[???] ";

function getInfoMessage(type, message){
	console.log(checkTypeMessage(type) + message);
}

function checkTypeMessage(type){
	switch(type){
		case "error"	:return ERROR_MESSAGE;
		case "info"		:return INFO_MESSAGE;
		case "warn"		:return WARNING_MESSAGE;
		case "success"	:return SUCCESS_MESSAGE;
		default 		:return UNDEFINED_MESSAGE; 
	}
}