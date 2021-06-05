var jmlAwal = 6969;
var totalHari = 441; //merupakan kelipatan dari 21 => 21x21 = 441
var hariKematian = 21;
var i;
var _tgl21ke = 0;
 
for(i = 1; i<=441; i++) {
  
  //Jika hari merupakan kelipatan dari 21
  if(i % hariKematian === 0)
  {
    _tgl21ke++;
    //Sebelum melahirkan, 11.1% mati
    jmlAwal = jmlAwal - ( jmlAwal * Math.round(11.1/100));
    jmlAwal = jmlAwal + jmlAwal;
    
    console.log("Hari 21 ke-" + _tgl21ke + " jumlah burung ada " + jmlAwal);
  }
}

console.log("Hari ke-"+i +" jumlah burungnya ada : " + jmlAwal);
