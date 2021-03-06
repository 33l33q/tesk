package ldb.task.service;

import java.util.List;

import ldb.task.vo.BoardVO;
import ldb.task.vo.ReplyVO;

public interface BoardService {
	
	public List<BoardVO> selectBoard(BoardVO bvo);//전체출력
	public List<BoardVO> cheabunBoard(BoardVO bvo);//채번출력

	public boolean insertBoard(BoardVO bvo);//정보입력
	
	public boolean updateHitnum(BoardVO bvo);//조회수증가
	public List<BoardVO> searchBoard(BoardVO bvo);//상세출력
	
	public boolean deleteBoard(BoardVO bvo);//게시글 삭제하기

	public boolean updateBoard(BoardVO bvo);//게시글 수정하기
	
	public List<BoardVO> checkPw(BoardVO bvo);//게시글 비밀번호 확인하기
	
	/********************댓글CRUD***********************/

	public List<ReplyVO> selectReply(ReplyVO rvo); //댓글 전체 출력
	
	public boolean insertReply(ReplyVO rvo);//댓글 입력
	public List<ReplyVO> cheabunReply(ReplyVO rvo);//댓글 채번 출력

	public List<ReplyVO> searchReply(ReplyVO rvo);//댓글 상세 출력
		
	public boolean updateReply(ReplyVO rvo);//댓글 수정
	public boolean deleteReply(ReplyVO rvo);//댓글 삭제

}
