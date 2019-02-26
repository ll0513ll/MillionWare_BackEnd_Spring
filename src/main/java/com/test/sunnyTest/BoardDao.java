package com.test.sunnyTest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardDao extends JpaRepository<Board, Integer> {
    Board findByIdx(Integer idx);
}
