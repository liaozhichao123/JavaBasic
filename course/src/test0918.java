public class test0918 {
    public static void main(String[] args) {
        //flower();
        prime();
    }
    public static boolean isPrime(int num){
        for(int i=2;i<=(int)Math.sqrt(num);i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static void prime(){
        for(int i=2;i<1001;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void flower(){
        for(int i=100;i<1000;i++){
            int a=i/100;//百位数
            int b=(i-a*100)/10;//十位数
            int c=i%10;//个位数
            int sum=(int)(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3));
            if(i==sum){
                System.out.print(i+"\t");
            }
        }
    }
}
class Employee{
    int id;
    String name;
    double basicSalary;
    double increaseRate;
    public Employee(){
        id=1000;
        name="无名氏";
        basicSalary=0.0;
        increaseRate=0.0;
    }
    public Employee(int id){
        this.id=id;
        name="新员工";
    }
    public Employee(int id,String name,double basicSalary){
        this.id=id;
        this.name=name;
        this.basicSalary=basicSalary;
        this.increaseRate=0.05;
    }

    public Employee(int id, String name, double basicSalary, double increaseRate) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.increaseRate = increaseRate;
    }

    public double increase(){
        return basicSalary*increaseRate;
    }
    public double totalSalary(){
        return basicSalary+this.increase();
    }
}
class Address{
    private String country;
    private String province;
    private String city;
    private String Street;
    private String postcode;

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", Street='" + Street + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
