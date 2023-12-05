!Alexander Ross
.section ".text"
        .global main

main:
        save %sp, -96, %sp
        mov -2, %i0          ! x
        mov -2147483648, %l0 ! max_result 
loop:
        mov %i0, %l1
        smul %l1, %l1, %l2
        smul %l2, %l1, %l3
        mov 14, %l4
        smul %l2, %l4, %l4
        sub %l3, %l4, %l5
        mov 56, %l4
        smul %l4, %l1, %l4
        add %l5, %l4, %l6
        mov 64, %l4
        sub %l6, %l4, %l7
        cmp %l7, %l0
        bg next
        mov %l0, %l7
next:
        add %i0, 1, %i0
        cmp %i0, 9
        ble loop
        sethi %hi(msg), %o0
        or %o0, %lo(msg), %o0
        mov %l7, %o1
        nop
        mov 0, %i0
        ret
        restore
        .section ".rodata"
msg:
        .asciz "The maximum output value is: %d\n"
