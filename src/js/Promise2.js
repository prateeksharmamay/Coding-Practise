function run(success = false){
    return new Promise((resolve, reject) => {
            if(success) return resolve()
            return reject()
        })
.then(() => {return new Object()})
.catch(err => {console.error('Promise Rejected')})
}

run(true)
    .then(() => {throw new Error('Something went wrong')})
.catch(err => { })
