const sort = (arr) => {
    for ( let i = 0; i < arr.length - 1; i++ ) {
        for ( let j = i + 1; j < arr.length; j++ ) {
            if ( arr[j] < arr[i] ) {
                let temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }
    return arr;
}

exports.sort = sort;
