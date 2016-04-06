import java.util.ArrayList;
import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(400);
		lista.add(179);
		lista.add(19);
		lista.add(18);
		lista.add(9);
		lista.add(5);
		lista.add(6);
		LinkedList<Integer> sortedList = sort(lista);
		for (int i=0; i<sortedList.size(); i++){
			System.out.print(sortedList.get(i) + " ");
		}

	}

	public static LinkedList<Integer> sort (ArrayList<Integer> unsortedVector){
		LinkedList<Integer> lista_sortata = new LinkedList<Integer>();
		lista_sortata.add(unsortedVector.get(0));
		
		for (int i=1; i<unsortedVector.size();i++){
			
			if (lista_sortata.get(0)>unsortedVector.get(i)){
				lista_sortata.addFirst(unsortedVector.get(i));
			}
			else{
				boolean visit = false;
				for (int j = 0; j<lista_sortata.size(); j++){
					if (lista_sortata.get(j)>unsortedVector.get(i)){
						lista_sortata.add(j, unsortedVector.get(i));
						visit = true;
						break;
					}
					
				}
				if (visit == false){
				lista_sortata.add(unsortedVector.get(i));
				}
			}
			
			
			
		}
		
		
		return lista_sortata;
	}
}
