package app;

import domain.Producto;
import java.util.Arrays;
import java.util.List;

public class InventarioDefault {


    /*
  new Producto("Leche", "Ideal", 3.00,"395g.")
  new Producto("Pollo fresco", 7.10,"1 kg"),
  new Producto("Chuleta pierna", 12.80,"1 kg"),
  new Producto("Arroz superior","Rompe Olla", 15.99,"bl x 5 kg"),
  new Producto("Arroz extra","Faraon", 20.49,"bl x 5 kg"),
  new Producto("Huevos Pardos","Bell's", 12.90,"pq x 30 unid"),
  new Producto("Queso Edam","Braedt", 8.20,"pq x 200 g"),
  new Producto("Queso Chedar","BONLÈ", 5.20,"pq x 136 g"),
  new Producto("Cerveza","Pilsen Callao", 17.90,"pq x 6 bt x 305 ml"),
  new Producto("Fortificante en Polvo","Milo", 35.09,"lta 1kg"),  
  new Producto("Cafe","Nescafe", 20.50,"lta 190 g"),
  new Producto("Fideo","Don Vittorio", 3.99,"bl 1 kg"),
  new Producto("Atun","Primor",4.99,"lta 170 g"),
  new Producto("Atun","Florida",5.79,"lta 140 g"),
  new Producto("Mayonesa","Alacena",15.90,"Doypack 950 g"),
  new Producto("Durazno en mitades","Aconcagua",8.09,"lta 822 g"),
  new Producto("Mantequilla con sal","Gloria",13.79,"pt 400 g"),
  new Producto("Yogurt","YOLEIT",4.99,"bt 1 L."),
  new Producto("Fortificante instantaneo","KIWIGEN",16.00,"lta 400 g."),
  new Producto("Detergente el polvo","ACE",32.90,"bl 4 Kg"),
  new Producto("Detergente liquido","Ariel",55.50,"bt 2.8 L"),
  new Producto("Lejia","CLOROX",9.90,"bt 4L"),
  new Producto("Lavavajilla","AYUDIN",15.80,"fr. 1.2 L"),
  new Producto("Comida para perros","MIMASKOT",89.90,"bl. 15 Kg"),
  new Producto("Comida para perros","DOGSHOW",83.00,"bl. 8 Kg"),
  new Producto("Azúcar Rubia","MAXIMA" ,13.39,"bl 5 Kg"),
  new Producto("Avena","QUAKER", 11.99,"bl 1 Kg"),
  new Producto("Cereal de Maiz Integral","NESTLÉ", 9.90,"bl 800 gr."),
  new Producto("Mermelada","GLORIA", 3.50," Doypack 200 gr."),
  new Producto("Maizena","Duryea" ,7.60,"cj 500 g"),
  new Producto("Sal de mesa","EMSAL", 2.30,"bl 1 Kg"),
  new Producto("Barritas de pescado","UMI FOOD",10.40,"cj 300 g"),
  new Producto("Aceite de pescado","Nature's Bounty",54.40,"bt 1200 mg"),
  new Producto("Salsa roja", "Molitalia",2.70,"Doypack 390 g."),
  new Producto("Carne molida", "LOS HIERROS",9.90,"bl 500 g.")
    
  
     */
    /** ME falta refactorizar todos los productos, ahora estos tienen el parametro de unidad, como String, todos!! */
    static List<Producto> getDefaultInventario() {
        return Arrays.asList(
                new Producto("Leche", "Gloria", 4.20, "400 g."),
                new Producto("Leche", "Ideal", 3.00, "395g."),
                new Producto("Pollo fresco", 7.10, "1 kg"),
                new Producto("Chuleta pierna", 12.80, "1 kg"),
                new Producto("Arroz superior", "Rompe Olla", 15.99, "bl x 5 kg"),
                new Producto("Arroz extra", "Faraon", 20.49, "bl x 5 kg"),
                new Producto("Huevos Pardos", "Bell's", 12.90, "pq x 30 unid"),
                new Producto("Queso Edam", "Braedt", 8.20, "pq x 200 g"),
                new Producto("Queso Chedar", "BONLÈ", 5.20, "pq x 136 g"),
                new Producto("Cerveza", "Pilsen Callao", 17.90, "pq x 6 bt x 305 ml"),
                new Producto("Fortificante en Polvo", "Milo", 35.09, "lta 1kg"),
                new Producto("Cafe", "Nescafe", 20.50, "lta 190 g"),
                new Producto("Fideo", "Don Vittorio", 3.99, "bl 1 kg"),
                new Producto("Atun", "Primor", 4.99, "lta 170 g"),
                new Producto("Atun", "Florida", 5.79, "lta 140 g"),
                new Producto("Mayonesa", "Alacena", 15.90, "Doypack 950 g"),
                new Producto("Durazno en mitades", "Aconcagua", 8.09, "lta 822 g"),
                new Producto("Mantequilla con sal", "Gloria", 13.79, "pt 400 g"),
                new Producto("Yogurt", "YOLEIT", 4.99, "bt 1 L."),
                new Producto("Fortificante instantaneo", "KIWIGEN", 16.00, "lta 400 g."),
                new Producto("Detergente el polvo", "ACE", 32.90, "bl 4 Kg"),
                new Producto("Detergente liquido", "Ariel", 55.50, "bt 2.8 L"),
                new Producto("Lejia", "CLOROX", 9.90, "bt 4L"),
                new Producto("Lavavajilla", "AYUDIN", 15.80, "fr. 1.2 L"),
                new Producto("Comida para perros", "MIMASKOT", 89.90, "bl. 15 Kg"),
                new Producto("Comida para perros", "DOGSHOW", 83.00, "bl. 8 Kg"),
                new Producto("Azúcar Rubia", "MAXIMA", 13.39, "bl 5 Kg"),
                new Producto("Avena", "QUAKER", 11.99, "bl 1 Kg"),
                new Producto("Cereal de Maiz Integral", "NESTLÉ", 9.90, "bl 800 gr."),
                new Producto("Mermelada", "GLORIA", 3.50, " Doypack 200 gr."),
                new Producto("Maizena", "Duryea", 7.60, "cj 500 g"),
                new Producto("Sal de mesa", "EMSAL", 2.30, "bl 1 Kg"),
                new Producto("Barritas de pescado", "UMI FOOD", 10.40, "cj 300 g"),
                new Producto("Aceite de pescado", "Nature's Bounty", 54.40, "bt 1200 mg"),
                new Producto("Salsa roja", "Molitalia", 2.70, "Doypack 390 g."),
                new Producto("Carne molida", "LOS HIERROS", 9.90, "bl 500 g.")
        );
    }

}
