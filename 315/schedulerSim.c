  /*  PUT YOUR CODE TO COMPLETE THE prio FUNCTION HERE  */

// Find the process with the highest priority
  for(i = 0; i < N; i++) {
    if(p[i].arrived && p[i].status != DONE) {
      if(maxPid == NONE || p[i].priority > maxPriority) {
        maxPid = i;
        maxPriority = p[i].priority;
      }
    }
  }

  if(maxPid != NONE) {
    if(current_pid != NONE) {
      p[current_pid].status = WAITING;
    }
    p[maxPid].status = ONCPU;
    current_pid = maxPid;
    if(p[maxPid].start == NONE) p[maxPid].start = current_time;
  }
}
  /********* End of Your Code ***********/

}
