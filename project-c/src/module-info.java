module project.c {
    exports project_c.repo;
   // requires project.f;
    requires  project.e;
    requires transitive project.b;

}