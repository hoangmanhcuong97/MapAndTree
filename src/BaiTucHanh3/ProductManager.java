package BaiTucHanh3;

import java.util.*;

public class ProductManager {
    List<Product> quanly = new ArrayList<Product>();
    Scanner sc = new Scanner(System.in);

    public Product creatProduct(){
        sc.nextLine();
        System.out.println("Nhap ten sp:");
        String name = sc.nextLine();
        System.out.println("Nhap id sp:");
        String id = sc.nextLine();
        System.out.println("Nhap gia sp:");
        int price = sc.nextInt();
        sc.nextLine();
        Product addNewProduct = new Product(name, id, price);
        return addNewProduct;
    }

    public void addProducts(){
        System.out.println("Nhap so luong san pham ban muon them:");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            quanly.add(creatProduct());
            System.out.println(quanly);
        }
    }

    public int findId(String id){
        int index = -1;
        for (int i = 0; i <quanly.size() ; i++) {
            if(quanly.get(i).getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void findName(){
        System.out.println("Nhap ten can tim kiem:");
        String name = sc.nextLine();
        for (Product newName: quanly) {
            if(newName.getNameSp().equals(name)){
                System.out.println(newName);
            }
        }
    }

    public void editProduct(){
        System.out.println("Nhap id sp thay doi:");
        String id = sc.nextLine();
        int index = findId(id);
        quanly.set(index,creatProduct());
        System.out.println(quanly);
    }

    public void deleteProduct(){
        System.out.println("Nhap id sp muon xoa:");
        String id = sc.nextLine();
        int index = findId(id);
        quanly.remove(index);
        System.out.println(quanly);
    }

    public void sortProduct(){
        System.out.println("Sap xep danh sach san pham theo gia:");
        Collections.sort(quanly, new Comparator<Product>() {
                    @Override
            public int compare(Product a, Product b) {
                return a.getPrice() > b.getPrice()? 1 : -1;
            }
        });
        System.out.println(quanly);
    }

}
