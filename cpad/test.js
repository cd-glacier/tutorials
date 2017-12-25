const util = require('util');

const pascal = (n, m) => {
  if (n <= m) { return 1 }
  else if (m == 1) { return 1 }
  else {
    return (pascal(n-1, m-1) + pascal(n-1, m))
  }
};


const arg = Number(process.argv[2]);
const ans = Array.apply(null, Array(arg)).map(function (_, i) {return i+1;})
  .map( i => { return pascal(arg, i) });

ans.forEach( a => {
  util.print(a);
  util.print(" ");
});



