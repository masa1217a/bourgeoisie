package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.bourgeoisie.dao.GenreDao;
import com.bourgeoisie.dto.Genre;

class GenreDaoTest {

	@Test
	void testAll() {

		List<Genre> list = GenreDao.all();

		System.out.println("ジャンル1個目:"+list.get(0).getGenre());
		assertEquals(list.get(0).getGenre(), "レストラン");


	}

}
