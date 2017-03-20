package VladimirRudenko.app.classwork.lesson16;

/**
 * Created by vladimir on 09.03.17.
 */
public enum  Holidays {

        New_Year(31, "October", "New Year"), March_8(8, "March", "March 8"), Happy_Beer(30, "March", "March 30");
        private int value;
        private String man;
        private String fullname;
        Holidays( int value, String man, String fullname){
            this.value = value;
            this.man = man;
            this.fullname = fullname;

            for (Holidays name : Holidays.values()) {
                System.out.println(fullname + " holiday is on " + name + "," + value);
            }
        }

    }

