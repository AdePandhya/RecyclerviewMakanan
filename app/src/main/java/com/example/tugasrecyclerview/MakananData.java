package com.example.tugasrecyclerview;

import java.util.ArrayList;

public class MakananData {
    private static String [] makananName = {
            "Sate Lilit",
            "Babi Guling",
            "Lawar Babi",
            "Nasi Ayam",
            "Nasi Jinggo",
            "Ayam Betutu",
            "Ayam Bakar",
            "Nasi Goreng"

    };

    private static String[] makananDetail = {
            "Sate Lilit merupakan sebuah sate yang dililit dan dipanggang",
            "Babi Guling merupakan makanan khas Bali yang berupa Babi yang diguling",
            "Lawar Babi merupakan makanan khas bali yang bahan nya dari sayur nangka yang dipotong kecil dan dicampur dengan darah dan daging babi",
            "Nasi ayam merupakan makanan yang berisikan Nasi dan suiran ayam sebagai lauknya",
            "Nasi Jinggo merupakan sebuah makanan yang dibungkus dengan daun pisang yang berisikan nasi,ayam,mie,sambal,dll",
            "Ayam Betutu merupakan ayam yang di buat dengan bumbu bali kuning atau disebut bumbu rajang yang merupakan makanan khas bali",
            "Ayam bakar merupakan sebuah ayam yang dibakar dengan balutan bumbu yang istimewa yaitu kecap, bawang dll",
            "Nasi Goreng Merupakan nasi yang di goreng dengan bumbu bumbu spesial yang bisa menambah cita rasa khas nusantara"
    };

    private static int[] makananImage = {
            R.drawable.satelilit,
            R.drawable.babiguling,
            R.drawable.lawar,
            R.drawable.nasiayam,
            R.drawable.nasijinggo,
            R.drawable.ayambetutu,
            R.drawable.ayambakar,
            R.drawable.nasigoreng
    };

    static ArrayList<Makanan> getListData(){
        ArrayList<Makanan> list = new ArrayList<>();
        for (int position = 0; position <makananName.length; position++) {
            Makanan makanan = new Makanan();
            makanan.setName(makananName[position]);
            makanan.setDetail(makananDetail[position]);
            makanan.setPhoto(makananImage[position]);
            list.add(makanan);
        }
        return list;
    }
}
