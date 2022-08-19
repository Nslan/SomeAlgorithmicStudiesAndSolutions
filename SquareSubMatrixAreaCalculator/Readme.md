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

![karematrisişlemleri](https://user-images.githubusercontent.com/107987193/185638115-87c1d6a4-c76a-4df8-919b-8a8e8f727ea7.png)

The largest square submatrix of the 4x5 matrix is a 4x4 matrix.
4x4 submatrix Their positions in the 4x5 matrix are listed below. 

Please watch the frames move!

4x5 matrisinin en buyuk kare alt matrisi 4x4 lük bir matristir
4x4 alt matrisi 4x5 matrisi içindeki konumları aşağıda belirtilmiştir

Lütfen cercevelerin hareketini izleyin!

![a1](https://user-images.githubusercontent.com/107987193/185638238-a20ed246-0fe3-4bdd-9234-30a66a757692.png)

so we detected 4x4 matrices.
Area of 4x4 square submatrix => 4 x 4 = 16
Now let's look at the positions of the 3x3 submatrices in the 4x5 matrix.

boylece 4x4 matrislerini tespit ettik.
eğer bu 4x4 matrislerinde bir tane alt kare matris elde edilebilmişse alan : 4 x 4 = 16
şimdi ise 3x3 alt matrislerini 4x5 matrisi içinde konumlarına bakalım  

![a2](https://user-images.githubusercontent.com/107987193/185638287-519d30a2-1dd4-4618-8576-c623d2e90159.png)
![a2 2](https://user-images.githubusercontent.com/107987193/185638316-d806d3e3-a27d-4326-8afe-135984487bb3.png)
![a3](https://user-images.githubusercontent.com/107987193/185638330-acd62e79-ad06-46ae-8dc1-233d214b3b37.png)

so we detected 3x3 matrices.

Area of 3x3 square submatrix = 9

Now let's look at the positions of the 2x2 submatrices in the 4x5 matrix.


boylece 3x3 matrislerini tespit ettik.
eğer bu 3x3 matrislerinde bir tane alt kare matris elde edilebilmişse alan : 3 x 3 = 9
şimdi ise 2x2 alt matrislerini 4x5 matrisi içinde konumlarına bakalım

![a4](https://user-images.githubusercontent.com/107987193/185638493-8a5f6211-0be5-40fd-95c2-e3a3e3510088.png)
![a4-1](https://user-images.githubusercontent.com/107987193/185638531-58cec102-3eb0-49df-99b3-8ffcdda29e6c.png)
![a4-2](https://user-images.githubusercontent.com/107987193/185638551-55581f95-2540-4452-8fca-984f3e69d24b.png)


so we detected 2x2 matrices.
Area of 2x2 square submatrix = 4


Now let's look at the positions of the 1x1 submatrices in the 4x5 matrix.
(these will already be the elements themselves)

boylece 2x2 matrislerinide tespit ettik.
eğer 2x2 lik bir alt kare matris bulunduysa alanı : 4 

şimdi ise 1x1 alt matrislerini 4x5 matrisi içinde konumlarına bakalım
(bunlar zaten elemanların kendileri olacaktır)
bunların alanları her zaman 1 dir

![ason](https://user-images.githubusercontent.com/107987193/185638629-13c1fc5b-bf6e-41e1-af77-fcf86cce5111.png)


Area of 1x1 square submatrix = always 1
