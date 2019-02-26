package com.test.sunnyTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class BoardController {

    @Autowired
    private BoardDao boardDao;



    @RequestMapping("/list")
    public List<Board> list() {
//        repository.save(new Board("test1", "안녕하세요1", "나", new Date()));
//        repository.save(new Board("test2", "안녕하세요2", "나", new Date()));
//        repository.save(new Board("test3", "안녕하세요3", "나", new Date()));
//        repository.save(new Board("test4", "안녕하세요4", "나", new Date()));
//        repository.save(new Board("test5", "안녕하세요5", "나", new Date()));
        List<Board> list = boardDao.findAll();
        return list;
    }

    @RequestMapping("/write")
    public String write(Board board) {
        board.setInsertDate(new Date());
        return "/detail/"+boardDao.save(board).getIdx();
    }

    @RequestMapping("/detail/{idx}")
    public Board detail(@PathVariable Integer idx) {
        return boardDao.findByIdx(idx);
    }
}
