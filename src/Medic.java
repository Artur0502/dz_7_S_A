public class Medic extends  Hero  {

    private int healPoints;

    @Override
    public void applySuperAbility() {
        System.out.println("Medic �������� ���������������� heal" );


    }
    public  String increaseExperience() {
        String HP = healPoints +10+"%";
        return HP;
    }

}