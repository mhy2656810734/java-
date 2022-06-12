import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 26568
 * 一、二维数组转稀疏数组的步骤
 * 1.遍历原始的二维数组，得到有效数据的个数 sum
 * 2.根据sum创建稀疏数组sparseArr[sum + 1][3]
 * 3.将二维数组的有效数据存入到稀疏数组
 *
 * 二、稀疏数组转二维数组步骤
 * 1.先读取稀疏数组的第一行数据，根据第一行数据创建二维数组
 * 2.再读取稀疏数组的后几行，并赋值给二维数组即可
 * @date 2022-06-09 14:42
 */
public class text {
    public static void main(String[] args) {
        int[][] arr = new int[11][11];
        arr[1][2] = 1;
        arr[2][3] = 2;
        int sum = 0;
        System.out.println("原有的二维数组：");
        for (int[] row:arr) {
            for (int ret:row) {
                System.out.printf("%d\t",ret);
            }
            System.out.println();
        }
        System.out.println();
        // 1.计算非0的个数
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                if (arr[i][j] != 0)
                {
                    sum++;
                }
            }
        }
        // 2.创建稀疏数组
        int[][] sparseArr = new int[sum+1][3];
        //给稀疏数组赋初值
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        // 3.然后将原来二维数组的值赋值给稀疏数组
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                if (arr[i][j] != 0)
                {
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = arr[i][j];
                }
            }
        }
        System.out.println("稀疏数组");
        for (int[] row:sparseArr) {
            for (int ret:row) {
                System.out.printf("%d\t",ret);
            }
            System.out.println();
        }
        // 二、稀疏数组转二维数组
        // 1.读取稀疏数组第一行数据，创建二位数珠
        int[][] arr1 = new int[sparseArr[0][0]][sparseArr[0][1]];
        // 2.读取稀疏数组的后几行，赋值给二维数组
        for (int i = 1; i < sparseArr.length; i++) {
            arr1[sparseArr[i][0]][sparseArr[i][1]] =sparseArr[i][2];
        }
        System.out.println("创建的二维数组");
        for (int[] row:arr1) {
            for (int ret:row) {
                System.out.printf("%d\t",ret);
            }
            System.out.println();
        }
    }
}
