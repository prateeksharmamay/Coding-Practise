/**
 * Created by Prateek on 3/31/2017.
 */
/* for(var i = 0 ; i < arr.length ; i++){
 setTimeout(function(){
 console.log(arr[i])
 }, 1000);
 }

 console.log("Array Processed");
 */

function displayArr(arr,callback){
    for(var i = 0 ; i < arr.length ; i++){
        //console.log(arr[i]);
        (function(vali){setTimeout(function(){
            console.log(arr[vali])
            if(vali == arr.length - 1){
                var res = "Array Processes";
                callback(null,res);
            }
        }, 1000)})(i);
    }
}

var processArr = new Promise(function(resolve, reject){
    var arr = ["1","2","3","4","5","6","7","8","9","10","11","12"];

    displayArr(arr,function(err,res){
        if(err != null){
            reject("Error");
        }

        resolve(res);
    });
});

var ifDone = function(){
    processArr.then(function(res){
        console.log(res);
    }).catch(function(err){
        console.log(err);
    });
}

ifDone();
