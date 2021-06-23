package chapterSeventeen.manipulatingInvoiceStream;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class InvoiceStream {

    List<Invoice> invoices = new ArrayList<Invoice>();

    public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }

    public void readInvoiceFile() throws IOException {

        try (Scanner scanner = new Scanner(Paths.get("src\\chapterSeventeen\\manipulatingInvoiceStream\\Invoices.txt"))) {
            while (scanner.hasNext()) {
                String[] values = scanner.nextLine().split(" ");
                Invoice invoice = new Invoice(Integer.parseInt(values[0]),
                       values[1],
                        Integer.parseInt(values[2]),
                        Double.parseDouble(values[3]));
                addInvoice(invoice);
            }
        }
    }

    public void sortByPartDescription() {
        invoices.stream()
                .sorted(Comparator.comparing(Invoice::getPartDescription))
                .forEach(System.out::println);
    }

    public void sortByPrice() {
        invoices.stream()
                .sorted(Comparator.comparing(Invoice::getPrice))
                .forEach(System.out::println);
    }

    public Map<Integer, List<Invoice>> mapByQuantity(){
        Map<Integer, List<Invoice>> groupByQuantity = invoices.stream()
                .sorted(Comparator.comparing(Invoice::getQuantity))
                .collect(Collectors.groupingBy(Invoice::getQuantity));
        return groupByQuantity;
    }

    public Map<String, List<Invoice>> mapByDescription(){
        Map<String, List<Invoice>> groupByDesc = invoices.stream()
                .sorted(Comparator.comparing(Invoice::getQuantity))
                .collect(Collectors.groupingBy(Invoice::getPartDescription));
        return groupByDesc;
    }

    public static void main(String[] args) {
        InvoiceStream stream = new InvoiceStream();
        try {
            stream.readInvoiceFile();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Sorting by description");
        stream.sortByPartDescription();

        System.out.println("Sorting by price");
        stream.sortByPrice();

        System.out.println("group by quantity");
        System.out.println(stream.mapByQuantity());  ;

    }
}
