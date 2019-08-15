import searchtree.BinarySearchTree;

import java.io.*;

public class Main {
    public static void main(String[] args) {

       /* Garage g = new Garage(52, "Rókusi", true, new Car("Feri", 90));
        System.out.println(g);

        try {
            FileOutputStream fs = new FileOutputStream("garage.ser");
            ObjectOutputStream out = new ObjectOutputStream(fs);
            out.writeObject(g);
            out.close();
            fs.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Garage g2;

        try {
            FileInputStream fileIn = new FileInputStream("garage.ser");
            ObjectInputStream oi = new ObjectInputStream(fileIn);
            g2 = (Garage) oi.readObject();
            System.out.println(g2);
            oi.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        BinarySearchTree bst = new BinarySearchTree();
        bst.insertNode(20);
        bst.insertNode(15);
        bst.insertNode(10);
        bst.insertNode(25);

        System.out.println(bst.search(bst.root, 20));
        bst.inorderTreeWalk(bst.root);


        bst.deleteRecord(bst.root, 10);
        bst.inorderTreeWalk(bst.root);



        var szo = "Szo";
        var szam = 10;

        try {
            var os = new ObjectOutputStream(new FileOutputStream("cica.tyt"));              //var lokális változóknál, mindig inicializálni kell.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
