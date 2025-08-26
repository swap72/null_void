import java.util.*;

public class RecentRequests{
    
    public static List<String> getLatestRequests(List<String> requests, int k){
    List<String> report = new ArrayList<String>();
    int i =requests.size()-1;
    while(report.size()!=k){
        if(!report.contains((requests.get(i)))){
            report.add(requests.get(i));
            
            }
            i--;
        }
        return report;
    }
    
    public static void main(String[] args) {
    List<String> requests = new ArrayList<String>(List.of("i1","i2","i3","i1","i3"));
        System.out.println(getLatestRequests(requests,3));
    }
}