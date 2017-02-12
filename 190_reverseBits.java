public int reverseBits(int n) {
    int result = 0;
    for (int i = 0; i < 32; i++) {
        result += n & 1;
        n >>>= 1;   // CATCH: must do unsigned shift
        if (i < 31) // CATCH: for last digit, don't shift!
            result <<= 1;
    }
    return result;
}
//wrong
//  public int reverseBits(int n) {
//     int res = 0;
//     for (int i = 0; i < 32; i++){
//       res = res + n & 1;
//       n = n >>> 1;
//       if (i < 31){
//         res = res << 1;
//       }
//     }
//     return res;
// }