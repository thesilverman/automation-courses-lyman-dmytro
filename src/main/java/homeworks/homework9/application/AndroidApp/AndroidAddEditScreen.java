package homeworks.homework9.application.AndroidApp;

import homeworks.homework9.application.AddEditScreen;

public class AndroidAddEditScreen implements AddEditScreen {

     @Override
     public void fillPetForm() {
          System.out.println("--> android set new color");
          System.out.println("--> android set new name");
     }

     @Override
     public void savePet() {
          System.out.println("--> android save pet");
     }

     public void backButton(){
          System.out.println("--> android back to main screen");
     }

}
