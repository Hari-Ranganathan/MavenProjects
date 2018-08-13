/**
 * 
 */
function submit_hashing(){
	var password = document.getElementById("pwtext").value;
	var hashtypes = document.getElementById("types").value;
	var hashtype;
	if(document.getElementById('type1').checked){
		hashtype = document.getElementById('type1').value;
		hastype = window.btoa(hashtype);
	}else if(document.getElementById('type2').checked){
		hashtype = document.getElementById('type2').value;
		hastype = window.btoa(hashtype);
	}else if(document.getElementById('type3').checked){
		hashtype = document.getElementById('type3').value;
		hastype = window.btoa(hashtype);
	}
	
	var submission = document.getElementByClassName("password");
	submission[0].submit;
}

function submit_hashing(){
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function(){
		
	}
}