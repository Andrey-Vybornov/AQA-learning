package qa.guru;

public class FirstCheacher {
    int hdd;
    int diagonale;
    Model model;
    public FirstCheacher (int hdd, int diagonale, Model model ) {
        this.hdd = hdd;
        this.diagonale = diagonale;
        this.model = model;
    }
    public void setMacbook() {

        if (hdd > 512 && diagonale > 14)  {
            System.out.println("Вы приобрели ноутбук " + model);
       } else
        if (hdd == 512 && diagonale == 14) {
            System.out.println( "Вы приобрели ноутбук " + model);
        }else
        if (hdd < 512 && diagonale < 14) {
            System.out.println( "Вы приобрели ноутбук " + model);
        }
        else {
            System.out.println("К сожаления с такими параметрами нет ноутбуков");

            }
        }
}
