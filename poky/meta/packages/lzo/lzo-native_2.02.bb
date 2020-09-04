require lzo_${PV}.bb
inherit native
S = "${WORKDIR}/lzo-${PV}"
CPPFLAGS_append = " -std=c90"
