package homeworks.homework9.application.IOsApp;

import homeworks.homework9.application.AddEditScreen;

public class IOsAddEditScreen implements AddEditScreen {

     @Override
     public void fillPetForm() {
          System.out.println("--> IOs set new color");
          System.out.println("--> IOs confirm ret param change");
          System.out.println("--> IOs set new name");
          System.out.println("--> IOs confirm ret param change");
     }

     @Override
     public void savePet() {
          System.out.println("--> IOs save pet");
          System.out.println("--> IOs message about save");
     }

     public void backButton(){
          System.out.println("--> IOs back to main screen");
     }

}
