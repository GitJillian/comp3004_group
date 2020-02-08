public class Food{
  
  private String name;
  private Float calorie;
  private Boolean status;

  public Food(String name, Float calorie, Boolean status){
    this.name = name;
    this.calorie = calorie;
    this.status = status;
  }
  
  public void SetFood(String name, Float calorie, Boolean status){
    this.name = name;
    this.calorie = calorie;
    this.status = status;
  }
  
  public String getName(){
    return this.name;
  }
  
  public Float getCalorie(){
    return this.calorie;
  }
  
  public Boolean getStatus(){
    return this.status;
  }
  

}