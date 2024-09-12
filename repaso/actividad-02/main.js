alert('Alert: Hello World!');

// show vars basic

var name = "Nabil L. A."
var age = 19

/*
var concat = name + " " + age;

// document.write(name)

var data = document.getElementById("data");

//data.innerHTML = concat;

data.innerHTML = `
    <h1> Data text box: </h1>
    <h2> My name is ${name}</h2>
    <h3> Age: ${age} </h3>
`;

//control structures

if(age >= 18){
    data.innerHTML += `<h1> You're an adult! </h1>`;
} else {
    data.innerHTML += `<h1> You're underage </h1>`;
}

for(var i=2020; i<=2024; i++){
    data.innerHTML += "<h3> Current year is: " + i +"</h3>";
}
*/

function showName(name, age){
    var data = document.getElementById("data");
    data.innerHTML = `
    <h1> Data text box: </h1>
    <h2> My name is ${name}</h2>
    <h3> Age: ${age} </h3>
    `;
}

showName("Claus", 47)

function showNameV2(name, age){
    var data =`
    <h1> Data text box: </h1>
    <h2> My name is ${name}</h2>
    <h3> Age: ${age} </h3>
    `;

    return data;
}


function printData(){
    data.innerHTML = showNameV2("Leif", 21);
}

printData();

// multiples values --> arrays

var nameList = ['Claus', 'Leif']
document.write('<h2> Name list:</h2>');

/*
for(var i=0; i<nameList.length; i++){
    document.write(nameList[i] + "<br>");
}
*/

// for each
nameList.forEach(function(name) {
    document.write(name + "<br/>");
});
