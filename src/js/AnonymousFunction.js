/**
 * http://usejsdoc.org/
 */
/* OUTPUT
7
E:\SJSU\Programming\Github\Coding-Practise\src\js\AnonymousFunction.js:16
moo(1);
^

ReferenceError: moo is not defined*/
(function(){
    function foo(x){
        var baz = 3;

        return function (y){
            console.log(x+y+(++baz))
        }
    }
    var moo = foo(2);
    moo(1);
})();

moo(1);

