function displayElementValue(id, text){
    var element = document.getElementById(id);
    element.value = text;
}

function getElementValue(id){
    var element = document.getElementById(id);
    return element.value;
}

function displayContactNotFound()
{
    alert("Not found");
}




let totalinform = new Array();

function doSave() {
    alert("Saves a contact in the store");

    let doSaveName = document.getElementById("name").value;
    let doSaveAddress = document.getElementById("address").value;
    let doSavePhone = document.getElementById("phone").value;
}

function doFind() {
    var name = getElementValue("name");
    if(name=="Rob Miles")
    {
        displayElementValue("address", "18 Pussycat Mews\nLondon\nNE1 410S");
        displayElementValue("phone", "+44(1234) 56789");
    }
    else {
        displayContactNotFound();
    }
}