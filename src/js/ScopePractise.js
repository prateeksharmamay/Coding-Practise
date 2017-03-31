/**
 * Created by Prateek on 3/31/2017.
 */
/* OUTPUT
k
E:\SJSU\Programming\Github\Coding-Practise\src\js\ScopePractise.js:13
console.log(d);
^

ReferenceError: d is not defined*/

var n = "k"
function alloc(){
    if(n == "k"){
        var d = "p";
    }
}


console.log(n);
console.log(d);