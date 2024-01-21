namespace FirstSpace
{
    class FirstTry
    {
        public static void Main(string[] args)
        {
            AgePool agePool = new AgePool();
            Console.WriteLine(agePool.age);

            Sun sunOb = new Sun(12);
            Console.WriteLine(sunOb.getNum());
        }
    }

    public class AgePool
    {
        public int age = 3;
        public void getAge()
        {
            Console.WriteLine(this.age);
        }
    }


    struct SSample
    {
        int x;
        int y;
    }

    interface IForSun
    {

        int getNum();
    }

    class Sun : AgePool, IForSun
    {
        public Sun(int num)
        {
            // this.num = num;
        }
        private int num;
        public int getNum()
        {
            return this.num;
        }
    }
}