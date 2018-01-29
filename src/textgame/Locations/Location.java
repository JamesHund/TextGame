/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textgame.Locations;

/**
 *
 * @author James
 */
public class Location {
    //find out how to make abstract without affecting ActionBox
    protected String text, option1, option2, option3;
    
    public Location(String text, String option1, String option2, String option3){
        this.text = text;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
    }

    public String getText() {
        return text;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }
    
    
    
    public void perform1(){
        
    }
    public void perform2(){
        
    }
    public void perform3(){
        
    }
    
    
}
