const search = (arr, num) => {
    for ( let i of arr ) {
        if ( i === num ) {
            return true;
        }
    }
    return false;
};

exports.search = search;
