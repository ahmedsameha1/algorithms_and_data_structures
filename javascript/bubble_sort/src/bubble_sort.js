const sort = (arr) => {
    let swap = true;
    while(swap) {
        swap = false;
        for (let i = 0; i < arr.length - 1; i++) {
            if ( arr[i + 1] < arr[i] ) {
                let temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
                swap = true;
            }
        }
    }
    return arr;
}

exports.sort = sort;
