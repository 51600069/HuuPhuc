/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Hữu Phúc PD
 */
public class MyBigNumber {
    public String sum(String num1, String num2){
		
		int max = (num1.length() < num2.length() ? num2.length():num1.length());// lay do dau lon nhat giua a va b
		
                
                int length1 = num1.length();// do dai chuoi thu 1
                int length2 = num2.length();// do dai chuoi thu 2
		
		int vitri1 = 0;// Vị trí chuỗi s1
                int vitri2 = 0;// Vị trí chuỗi s2
                
                char p1;// kí tự c1 dùng để lấy kí tự cuối cùng của chuỗi s1
                char p2;// kí tự c2 dùng để lấy kí tự cuối cùng của chuỗi s2
                
                int tong = 0;// Khởi tạo biến tổng = 0 để cộng 2 kí tự cuối cùng lại với nhau
                int nho = 0;// Khởi tạo số nhớ = 0 để khi cộng sẽ có vài trường hợp lớn hơn 9
                String result = "";
		int i = 0;
		for( i = 0 ; i < max ; i++ ){
			vitri1 = length1 - i - 1;// cập nhật lại vị trí chuỗi s1
                        vitri2 = length2 - i - 1;// cập nhật lại vị trí chuỗi s2
                        p1 = (vitri1 >= 0) ? num1.charAt(length1 - i - 1) : '0';
                        p2 = (vitri2 >= 0) ? num2.charAt(length2 - i - 1) : '0';
                        tong = (p1 - '0') + (p2 - '0') + nho;// chuyển kí tự thành số xong cộng cho số nhớ
                        result = (tong % 10) + result;// Lấy kết quả tổng ở trên chia lấy dư cho 10 và ghép vào chuỗi kết quả
                        nho = tong / 10;// Cập nhật lại số nhớ
		}
                
                if (nho > 0){
                    result = nho + result;// Nếu số nhớ còn dư thì ghép vào chuỗi kết quả
                }
		
                return result;// Trả về kết quả thu được

    

}
}
