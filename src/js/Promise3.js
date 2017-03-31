function concat(a, b, callback) {
    setTimeout(function() {
        var r = a + b;
        callback(r);
    }, 0);
}

function upper(a, callback) {
    setTimeout(function() {
        var r = a.toUpperCase();
        callback(r);
    }, 0)
}

function decor(a, callback) {
    setTimeout(function() {
        var r = '*' + a + '*';
        callback(r);
    }, 0)
}

function concatP(a, b) {
    return new Promise( (resolve,reject) => {
        concat(a,b,(err,res) => {
        if(err) reject(err);
        resolve(res);
    });
})
};;

function upperP(a) {
    return new Promise(resolve => {
            upper(a, resolve)
        })
}

function decorP(a) {
    return new Promise(resolve => {
            decor(a, resolve)
        })
}

concatP('hello', 'world')
    .then(res => upperP(res))
.then(res =>decorP(res))
.then(res =>console.log(res))
//	.catch(console.log)// *HELLOWORLD