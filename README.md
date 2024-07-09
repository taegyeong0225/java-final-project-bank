# 2학년 2학기 모바일 프로그래밍 팀 프로젝트
## 환전 은행 관리 시스템 (현금 인출기 + 환전)

<strong>👏🏻팀원👏🏻</strong><br>
인하공업전문대학 컴퓨터정보공학과 <a href="https://github.com/taegyeong0225">고태경 </a> <br>
인하공업전문대학 컴퓨터정보공학과 <a href="https://github.com/binbin7878">최경빈</a> <br><br>

<strong>⚒️TOOLS⚒️</strong><br>
Tools: Apache NetBeans <br><br>

<strong>📱 LANGUAGE 📱</strong><br>
Java Version: Java 1.8 (Java 8)<br>
DataBase : mysql <br><br>

<strong>👏🏻 프로젝트 요약 👏🏻</strong><br>
프로젝트상 기능들은 기본적으로 은행의 ATM 기능을 많이 참고하였다.<br>
이중에서도 가장 기본적인 은행 업무인 입출금 기능, 거래 내역 조회를 구현하기로 하였으며, 이체 기능도 구현하였다. <br>
추가적으로 언어 변경 기능을 추가하여 외국인의 사용성을 고려하였다. 더 나아가 환전 기능을 추가하여 여행자의 입장을 고려하였다.<br>

<strong>👏🏻 구현 기능 👏🏻</strong><br>
1. 전체적인 UI 구현
2. 로그인 및 회원가입 기능
3. 캡챠 기능
4. DB 연동
5. 프레임 간 로그인 정보 공유 
6. 입금 및 출금 기능 
7. 조회 기능
8. 이체 기능
9. 환전 기능
10. 언어 변경 기능<br><br>
    
<strong>💾 DB (mysql) 💾</strong><br><br>
**DB명 : BankSystem** <br><br>
user 테이블 (유저정보) <br>
username : varchar(10)<br>
balance : int(10)<br>
uesrID : primary key varchar(20) userPW : varchar(20)<br>
 account : varchar(20)<br>
 accountPW : varchar(4)<br>
 PhoneNo : varchar(20)<br><br>
 
transaction 테이블 (거래내역)<br>
account (계좌번호) : varchar(20)<br>
type (거래구분) : varchar(5)<br>
amount (거래금액) : int(11)<br>
opponent (입금처) : varchar(10)<br>
date (거래날짜) : varchar(20)<br><br>

```mysql
create database BankSystem; USE BankSystem;
-- Create the user table
CREATE TABLE IF NOT EXISTS user (
  userID VARCHAR(20) PRIMARY KEY,
  username VARCHAR(10),
  balance INT,
  userPW VARCHAR(20),
  account VARCHAR(20),
  accountPW VARCHAR(4),
  PhoneNo VARCHAR(20)
);
-- Create the transaction table
CREATE TABLE IF NOT EXISTS transaction (
  account VARCHAR(20),
  type VARCHAR(5),
  amount INT,
  opponent VARCHAR(10),
  date VARCHAR(20)
);

```
<img width="369" alt="스크린샷 2024-07-10 오전 3 56 14" src="https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/6844a14e-e0b7-4387-a5fc-a6b22e3fa87e">

![1-1 로그인화면](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/601afaa5-aaf7-4986-8755-591ffc4e4ee2)
![1-1-1  로그인 실패 (비번)](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/b2df1140-5b6a-4801-a169-650737b64c5a)
![1-1-2  로그인실패(아이디 미존재](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/5c59f50b-0f93-424b-ad54-b943add77006)
![1-1-3  로그인 성공](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/58cd29f8-6963-4fda-8474-ed25291f0524)
![1-2-1아이디중복확인](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/81c2824e-deda-4a87-9f65-9dcda6667f33)
![1-2-2  아이디 중복확인 (중복)](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/9e3f8bd3-4e57-4467-89f0-6b32ea1da03d)

![1-2-3  캡챠 인증 실패](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/eebc32bf-425f-42d0-904f-577c72dedfae)
![1-2-4  회원가입 성공](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/819f42d3-25c0-4c78-89e2-fd51dde6f2bb)
![1  시작화면](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/47931f4f-9db5-4e66-b074-4a9cd4fe32b4)
![2-1-1 영어](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/023606af-c0fe-43d6-9132-55cc7cb7a79c)
![2-1-1일본어](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/6b307938-106d-4ca2-9339-ee6f82bffcfa)

![2-2 입금](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/817302bc-3cc8-4058-9da4-2502b1d57d72)
![2-2-1입금실패](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/5824518b-5aa7-43d9-881c-0f5f57b407aa)
![2-2-2 입금 완료](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/33762f45-6226-4301-b187-0fd458743f2e)

![2-3-1 출금실패_비밀번호 오류](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/b7028edd-da7c-4653-9e1d-4e072bd9bc9e)

![2-3-2  출금 실패-잔액 부족](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/e74736a8-bca6-4ccf-a3c0-ba84faa802b6)
![2-3-3  출금 성공](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/56214f0a-2de6-4f89-a25c-9866dd3b9fb1)
![2-3 출금 화면](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/08077c78-0f2f-4b9d-af12-fda7900e411e)
![2-4-1  이체실패](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/715952ed-d3a0-43dc-894d-81ddb74ce49b)
![2-4-2  이체 실패(계좌 미존재)](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/a3e950b9-cbf9-4f49-84e0-e68e2034cf4c)
![2-4 이체화면](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/0a539eb6-ab2d-4def-b25a-7cf2fbacd7ae)
![2-5  거래내역 조회](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/b5f15ce6-ca60-4c4e-ab16-8d73032a3cf6)
![2  은행 거래 화면](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/4a7ea96f-6bf7-408d-b8fa-92d493ab3cd5)
![이체성공](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/b893b4f5-58d0-4769-97d5-65039fe8ceac)
![회원가입화면](https://github.com/taegyeong0225/java-final-project-bank/assets/108190809/4b2b2854-f20d-41be-8c88-ef79ce0b1947)

