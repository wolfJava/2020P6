package task.simplefactory;

public class PayFactory {

    public IPay create(Class<? extends IPay> clazz){
        try{
            if (null != clazz){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


}
