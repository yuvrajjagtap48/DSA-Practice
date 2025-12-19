public class Reverse{
    public static void Reverse (int numbers[]){
        int first = 0, last = numbers.length-1;
        while(first <last ){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers [first ] = temp;
            first++;
            last--;
        }

    }
    public static void main(String[] args) {
        int numbers[] ={10,29,3,45,6,7,8,2,4,234,34,342,343};
        Reverse(numbers);
        for(int i=0; i<numbers.length;i++)
        {
            System.out.print(numbers[i]+ " ");
        }
    }
}