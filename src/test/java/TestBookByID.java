import com.entity.Book;
import com.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBookByID {
    @Test
    public void getBookByID(){
        ApplicationContext cpa = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) cpa.getBean("BookService");
        Book book = bookService.queryByID(1);
        System.out.println(book);
    }
}
