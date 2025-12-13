import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = {0, 0, 0, -1};
        int camera = 3;

        int n = Integer.parseInt(br.readLine());

        String[] cmd = new String[n];

        for (int i = 0; i < n; i++) {
            cmd[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            if (camera == 3) {
                if (cmd[i].equals("MR")) {
                    arr[2] -= 1;
                    arr[3] += 1;
                    camera = 4;
                }
                else if (cmd[i].equals("ML")) {
                    arr[2] += 1;
                    arr[3] += 1;
                    camera = 2;
                }
                else if (cmd[i].equals("W")) {
                    arr[1] += 1;
                    arr[3] += 1;
                }
                else if (cmd[i].equals("S")) {
                    arr[1] -= 1;
                    arr[3] -= 1;
                }
                else if (cmd[i].equals("D")) {
                    arr[0] += 1;
                    arr[2] += 1;
                }
                else if (cmd[i].equals("A")) {
                    arr[0] -= 1;
                    arr[2] -= 1;
                }
            }
            else if (camera == 4) {
                if (cmd[i].equals("MR")) {
                    arr[2] += 1;
                    arr[3] += 1;
                    camera = 1;
                }
                else if (cmd[i].equals("ML")) {
                    arr[2] += 1;
                    arr[3] -= 1;
                    camera = 3;
                }
                else if (cmd[i].equals("A")) {
                    arr[1] += 1;
                    arr[3] += 1;
                }
                else if (cmd[i].equals("D")) {
                    arr[1] -= 1;
                    arr[3] -= 1;
                }
                else if (cmd[i].equals("W")) {
                    arr[0] += 1;
                    arr[2] += 1;
                }
                else if (cmd[i].equals("S")) {
                    arr[0] -= 1;
                    arr[2] -= 1;
                }
            }
            else if (camera == 1) {
                if (cmd[i].equals("MR")) {
                    arr[2] += 1;
                    arr[3] -= 1;
                    camera = 2;
                }
                else if (cmd[i].equals("ML")) {
                    arr[2] -= 1;
                    arr[3] -= 1;
                    camera = 4;
                }
                else if (cmd[i].equals("S")) {
                    arr[1] += 1;
                    arr[3] += 1;
                }
                else if (cmd[i].equals("W")) {
                    arr[1] -= 1;
                    arr[3] -= 1;
                }
                else if (cmd[i].equals("A")) {
                    arr[0] += 1;
                    arr[2] += 1;
                }
                else if (cmd[i].equals("D")) {
                    arr[0] -= 1;
                    arr[2] -= 1;
                }

            }
            else {
                if (cmd[i].equals("MR")) {
                    arr[2] -= 1;
                    arr[3] -= 1;
                    camera = 3;
                }
                else if (cmd[i].equals("ML")) {
                    arr[2] -= 1;
                    arr[3] += 1;
                    camera = 1;
                }
                else if (cmd[i].equals("D")) {
                    arr[1] += 1;
                    arr[3] += 1;
                }
                else if (cmd[i].equals("A")) {
                    arr[1] -= 1;
                    arr[3] -= 1;
                }
                else if (cmd[i].equals("S")) {
                    arr[0] += 1;
                    arr[2] += 1;
                }
                else if (cmd[i].equals("W")) {
                    arr[0] -= 1;
                    arr[2] -= 1;
                }
            }

            System.out.printf("%d %d %d %d\n",arr[0],arr[1],arr[2],arr[3]);
        }
    }
}
