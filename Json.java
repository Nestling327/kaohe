package kaohe;

public class Json {
    public void select(String json){
        char[] json_array = json.toCharArray();
        char[] json_select = new char[json_array.length];
        int j=0;
        for (int i=0;i<json_array.length;i++){
            if (json_array[i]=='{'||json_array[i]=='}'||json_array[i]=='['||json_array[i]==']'){
                json_select[j] = json_array[i];
                j++;
            }
            //System.out.print(json_array[i]);
        }
        int k=0;
        int z=0;
        for (int i=0;i<=j;i++){//{"test":[{"test":"sdf"},{"test":"sdf"},{"test":"sdf"}]}
            System.out.print(json_select[i]);
            if (json_select[i]=='{'){
                k++;
                continue;
            }
            if (json_select[i]=='}'){
                k--;
                continue;
            }
            if (json_select[i]=='['){
                z++;
                continue;
            }
            if (json_select[i]==']'){
                z--;
                continue;
            }

        }
        if (k!=0||z!=0){
            System.out.println("非法"+json_select);
        }else {
            System.out.println("合法");
        }
    }
}
