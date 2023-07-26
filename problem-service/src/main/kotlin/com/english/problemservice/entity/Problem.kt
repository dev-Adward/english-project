package com.english.problemservice.entity

import com.english.problemservice.entity.enum.ProblemDifficulty
import com.english.problemservice.entity.enum.ProblemType
import javax.persistence.*


@Entity
@Table("tbl_toeic_problem")
class Problem (

    @Id
    @GeneratedValue
    val id : Long? = null,

    @Column
    @Lob
    val problemContent : String,

    @Column
    @Lob
    val problemTitle : String,

    @Column
    val isCorrect : Boolean,

    @Column
    val score : Integer,

    @Column
    val memberId : Long,

    @Column
    @Enumerated(EnumType.STRING)
    val category : ProblemType,

    @Column
    @Enumerated(EnumType.STRING)
    val difficulty : ProblemDifficulty,




) : BaseEntity()