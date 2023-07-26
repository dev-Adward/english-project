package com.english.problemservice.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.Lob
import javax.persistence.ManyToOne
import javax.persistence.Table


@Entity
@Table("tbl_toeic_answer")
class Answer(
    @Id
    @GeneratedValue
    val id : Long,

    @Column
    @Lob
    val answerTitle : String,

    @Column
    @Lob
    val answerContent : String,

    @Column
    val answerNumber : Integer,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "problem_id")
    val problem: Problem,

    //정답을 올린사람
    @Column
    val memberId : Long,



) : BaseEntity(){

}