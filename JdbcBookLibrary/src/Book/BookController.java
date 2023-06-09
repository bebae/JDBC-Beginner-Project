package Book;

import Sign.SignVO;

import java.util.List;
import java.util.Map;

public class BookController {
    private static BookController instance = new BookController();
    private BookController() {}
    public static BookController getInstance() {return instance;}

    private BookService service = BookService.getInstance();

    // 메인 책 리스트에서 페이징 기법용
    public List<BookVO> selectAllPage(int num) throws Exception {
        return service.selectAllPage(num, 10);
    }
    public List<BookVO> selectBook() throws Exception {
        return service.selectAll();
    }

    // BookVO 받아와서 서비스의 selectAll 리턴
    public List<BookVO> selectWord(String word, int num) throws Exception {
        return service.selectWord(word, num);
    }

    public int insertBook(BookVO vo) throws Exception {
        return service.insertBook(vo);
    }

    public int updateBook(BookVO vo) throws Exception {
        return service.updateBook(vo);
    }

    public int deleteBook(BookVO vo) throws Exception {
        return service.deleteBook(vo);
    }

    public List<LoanVO> idSelectReturn(SignVO signVO) throws Exception {
        return service.idSelectReturn(signVO);
    }

    public int loanBook(BookVO vo, SignVO signVO) throws Exception {
        return service.loanBook(vo, signVO);
    }

    public int returnBook(LoanVO rBook) throws Exception {
        return service.returnBook(rBook);
    }
}
