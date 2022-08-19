### SQUARE SUBMATRIX AREA  (kare alt matrislerin alanları)

> ### This program find the largest square submatrix and calculate its area
>  Bu program en buyuk alt kare matrisin alanını  verir 

While a matrix has square sub-matrices, the row column value of the largest sub-square matrix is the smallest of the row column values of the main matrix.
The smallest square submatrix of the matrix is 1x1, that is, each element itself.

Bir matrisin kare şeklinde alt matrisleri bulunurken en buyuk alt kare matrisin satır sutun değeri
esas matrisin satir sutun değerlerinden en kucugu kadardır.
Matrisin en kucuk kare alt matrisi ise 1x1 yani her bir elemanın kendisidir

Bir matrisin kare alt matrisi o matrisin kare şeklindeki tüm elemanları birbirinin aynı fakat
0 dan farklı olmalıdır işte bu şekilde matris uzerinden  elde edilen bu tip kare matrislere
alt karematrisler denir.

Square submatrix of a matrix, all square-shaped elements of that matrix must be the same but different from 0, 
so this type of square matrices obtained from the matrix are called sub-square matrices.

For example, let's look at all the square submatrices of the 4x5 matrix below
örnek olarak aşağıdaki  4x5 matrisinin kare şeklinde tum alt matrislerine bakalım

![](../../../Desktop/karematrisişlemleri.png)

The largest square submatrix of the 4x5 matrix is a 4x4 matrix.
4x4 submatrix Their positions in the 4x5 matrix are listed below. 

Please watch the frames move!

4x5 matrisinin en buyuk kare alt matrisi 4x4 lük bir matristir
4x4 alt matrisi 4x5 matrisi içindeki konumları aşağıda belirtilmiştir

Lütfen cercevelerin hareketini izleyin!

![](../../../Desktop/a1.png)

so we detected 4x4 matrices.
Area of 4x4 square submatrix => 4 x 4 = 16
Now let's look at the positions of the 3x3 submatrices in the 4x5 matrix.

boylece 4x4 matrislerini tespit ettik.
eğer bu 4x4 matrislerinde bir tane alt kare matris elde edilebilmişse alan : 4 x 4 = 16
şimdi ise 3x3 alt matrislerini 4x5 matrisi içinde konumlarına bakalım  

![](../../../Desktop/a2.png)![](../../../Desktop/a2.2.png)![](../../../Desktop/a3.png)

so we detected 3x3 matrices.

Area of 3x3 square submatrix = 9

Now let's look at the positions of the 2x2 submatrices in the 4x5 matrix.


boylece 3x3 matrislerini tespit ettik.
eğer bu 3x3 matrislerinde bir tane alt kare matris elde edilebilmişse alan : 3 x 3 = 9
şimdi ise 2x2 alt matrislerini 4x5 matrisi içinde konumlarına bakalım

![](../../../Desktop/a4.png)
![](../../../Desktop/a4-1.png)
![](../../../Desktop/a4-2.png)


so we detected 2x2 matrices.
Area of 2x2 square submatrix = 4


Now let's look at the positions of the 1x1 submatrices in the 4x5 matrix.
(these will already be the elements themselves)

boylece 2x2 matrislerinide tespit ettik.
eğer 2x2 lik bir alt kare matris bulunduysa alanı : 4 

şimdi ise 1x1 alt matrislerini 4x5 matrisi içinde konumlarına bakalım
(bunlar zaten elemanların kendileri olacaktır)
bunların alanları her zaman 1 dir

![](../../../Desktop/ason.png)

Area of 1x1 square submatrix = always 1
